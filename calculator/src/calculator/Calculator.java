/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sun.awt.image.BadDepthException;

/**
 *
 * @author hp
 */
public class Calculator extends Application {
    double sum=0;
    double difference=0;
    double product=1;
    double divide=0;
    @Override
    public void start(Stage primaryStage) {
        
        TextField tf=new TextField();
//        tf.setLayoutX(300);
  //      tf.setLayoutY(250);
       tf.setMinSize(200, 30);
        tf.setMaxHeight(30);
        tf.setMaxWidth(200);
        tf.setEditable(false);
        tf.setAlignment(Pos.CENTER_RIGHT);
         
       // tf.setAlignment(Pos.CENTER);
        Button bpercent=new Button("%");
        style(bpercent);
        Button bsqrt=new Button("SQRT");
        style(bsqrt);
        Button bcube=new Button("CRT");
        style(bcube);
                
        Button bsquare=new Button("x^2");
        style(bsquare);
        Button buponsquare=new Button("1/x");
        style(buponsquare);
        Button bclear=new Button("CE");
        style(bclear);
        Button bbackspace=new Button("<_");
        style(bbackspace);
        Button bdivide=new Button("/");
        style(bdivide);
        Button seven=new Button("7");
        style(seven);
        Button eight=new Button("8");
        style(eight);
        Button nine=new Button("9");
        style(nine);
        Button multiply=new Button("*");
        style(multiply);
        Button four=new Button("4");
        style(four);
        Button five=new Button("5");
        style(five);
        Button six=new Button("6");
        style(six);
        Button subtract=new Button("-");
        style(subtract);
        Button one=new Button("1");
        style(one);
        Button two=new Button("2");
        style(two);
        Button three=new Button("3");
        style(three);
        Button add=new Button("+");
        style(add);
        Button zero=new Button("0");
        style(zero);
        Button point=new Button(".");
        style(point);
        Button equals=new Button("=");
        style(equals);  
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            String h=tf.getText();
           
            tf.setText(h+"1");
            }
        });
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            String h=tf.getText();
           
            tf.setText(h+"2");
            }
        });
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            String h=tf.getText();
           
            tf.setText(h+"3");
            }
        });
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            String h=tf.getText();
           
            tf.setText(h+"4");
            }
        });
        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            String h=tf.getText();
           
            tf.setText(h+"5");
            }
        });
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
           String h=tf.getText();
            tf.setText(h+"6");
            }
        });
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            String h=tf.getText();
           
            tf.setText(h+"7");
            }
        });
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            String h=tf.getText();
           
            tf.setText(h+"8");
            }
        });
        nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            String h=tf.getText();
           
            tf.setText(h+"9");
            }
        });
        zero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            String h=tf.getText();
           
            tf.setText(h+"0");
            }
        });
        bclear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
         //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           tf.setText("");
           sum=0;
           difference=0;
           product=1;
           divide=0;
            }
        });
        bbackspace.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             String h=tf.getText();
           //  String m="\b";
           int f=h.length();
           tf.setText(h.substring(0, f-1));
            }
        });
        bsqrt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
           String text=tf.getText();
             double r=Double.parseDouble(text);
             r=Math.sqrt(r);
             text=String.valueOf(r);
            tf.setText(text);
            }
        });
         buponsquare.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
           String text=tf.getText();
             double r=Double.parseDouble(text);
             r=1/r;
             text=String.valueOf(r);
            tf.setText(text);
            }
        });
               bcube.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
           String text=tf.getText();
             double r=Double.parseDouble(text);
             r=Math.cbrt(r);
             text=String.valueOf(r);
            tf.setText(text);
            }
        });
 
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
          String text=tf.getText();
             double r=Double.parseDouble(text);
               sum=sum+r;
               
              tf.setText("");
                
                
             //double sum=0;
             
            }
        });
        subtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
          String text=tf.getText();
             double r=Double.parseDouble(text);
            if(difference==0&&r!=0)
            {
                difference=difference+r;
            
            //difference=difference*-1;//only one time;
            }
            else
            {
                r=r*-1;
                difference=difference+r;}
          //  text=String.valueOf(r);
              tf.setText("");
            }
        });
        multiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
          String text=tf.getText();
             double r=Double.parseDouble(text);
           product=product*r;
           tf.setText("");
            }
        });
        bdivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
          String text=tf.getText();
             Double r=Double.parseDouble(text);
            if(divide==0)
            {
             divide=r;
             }
            else
            {
            
                divide=divide/r;
              }
            tf.setText("");
            }
        });
        point.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                 String h=tf.getText();
           tf.setText(h+".");
            
            }
        });
        bsquare.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
           String text=tf.getText();
            double r=Integer.parseInt(text);
            r=r*r;
             text=String.valueOf(r);
            tf.setText(text);
            }
        });
        bpercent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
           String text=tf.getText();
            double r=Integer.parseInt(text);
            r=r/100;
             text=String.valueOf(r);
            tf.setText(text);
            }
        });
      
        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            
            public void handle(ActionEvent event) {
           String text;
                if(sum!=0)
                { 
                    String h=tf.getText();
                    if(h.equals(""))
                    {
                    text=String.valueOf(sum);
                    tf.setText(text);
                    sum=0;
                    }
                    else
                    {
                       text=tf.getText();
             double r=Double.parseDouble(text);
               sum=sum+r;
               text=String.valueOf(sum);
                    tf.setText(text);
                    sum=0;
         
                       }
                }
               //   difference=difference*-1;
                  if(difference!=0)
                { 
                     String h=tf.getText();
                     if(h.equals(""))
                     { 
                    text=String.valueOf(difference);
                    tf.setText(text);
                    difference=0;
                     } 
                     else
                     {    
                         text=tf.getText();
                         double r=Double.parseDouble(text);
                         if(difference==0&&r!=0)
            { 
                difference=difference+r;
            
           // difference=difference*-1;//only one time;
            }
            else
                         {   r=r*-1;
                             difference=difference+r;}
                     text=String.valueOf(difference);
                    tf.setText(text);
                    difference=0;}
                
                }
                  if(product!=1)
                  {String h=tf.getText();
                    if(h.equals(""))
                    {
                      text=String.valueOf(product);
                    tf.setText(text);
                    product=1;
                    }
                    else
                    {
                            text=tf.getText();
             double r=Double.parseDouble(text);
           product=product*r;
 
                        text=String.valueOf(product);
                    tf.setText(text);
                    product=1;
                    
                      }
                    }
                  if(divide!=0)
                  {
                      String h=tf.getText();
                      if(h.equals(""))
                      {text=String.valueOf(divide);
                    tf.setText(text);
                    divide=0;
                      }
                      else
                      {
                          text=tf.getText();
             Double r=Double.parseDouble(text);
            if(divide==0)
            {
             divide=r;
             }
            else
            {
            
                divide=divide/r;
              }
                          text=String.valueOf(divide);
                    tf.setText(text);
                    divide=0;
                      }
                    }
                       }
        });
                
//Button bbackspace=new Button("<_");
        //Button bdivide=new Button("/");
        
        FlowPane p = new FlowPane();        
        
        p.getChildren().addAll(tf,bpercent,bsqrt,bcube,bsquare,buponsquare,bclear,bbackspace,bdivide,seven,eight,nine,multiply,four,five,six,subtract,one,two,three,add,zero,point,equals);
        
        Scene sc = new Scene(p, 200, 210);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void style(Button a)
    {
        a.setFont(Font.font("Latin", 12));
    //    a.setBorder(Border.EMPTY);
        a.setMinSize(50, 30);
        a.setMaxHeight(20);
        a.setMaxWidth(50);
        a.setWrapText(true);
//  a.setShape(value);
    }
    
    
}
