/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BoxLayout;
import entities.Comment;
import java.util.ArrayList;
import services.ServicePost;

/**
 *
 * @author hp
 */
public class HomeForm extends Form {
    
    
    public HomeForm() {
        
        setTitle("Blog");
        setLayout(BoxLayout.y());
        
        Button btnShow = new Button ("afficher tous les posts");
        addAll(btnShow);
   
        btnShow.addActionListener((evt) -> {
            new ShowForm(this).show();
        });
        

      /*  btnShowSinglePost.addActionListener((evt) -> {
            new ShowSinglePost(this).show();
        });*/
        
    }
    
}
