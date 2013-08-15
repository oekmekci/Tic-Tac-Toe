/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class zeki implements Player{
Random random=new Random();
  Cell cell;
  Cell rakip;

    @Override
    public Point makeMove(Board board, Cell cell) {
   Point a=null;
 
 
    if(a==null){
   a=atakDefans(board, "defans");
  
   
   if(a==null){
       a=hamle(board,"defans");
   
   
   if(a==null){
   a=rndom(board);
   
   }}}
   
   
        return a;
       
    }
  
     
     
   private int checkCell(int i, int j,Board board){
    if (i < 0 || i >=board.getNumberOfRows()) {
            return 3;
        }
        if (j < 0 || j >=board.getNumberOfColumns()) {
            return 3;
        }
         if( board.getCell(i, j)==cell){return 1;}
         else if(board.getCell(i, j)==null){return 0;}
         else if(board.getCell(i, j)==rakip){return 2;}
        return 1;
 }
    
     public Point rndom(Board board){
         Point pnt2;
        ArrayList<Point> freeCells = new ArrayList<Point>();
        
        for (int i = 0; i < board.getNumberOfRows(); i++) {
            for (int j = 0; j < board.getNumberOfColumns(); j++) {
                if (board.getCell(i, j) == null) {
                    freeCells.add(new Point(i, j));
                }
            }
        }
        if (freeCells.isEmpty()){}
        pnt2= freeCells.get(random.nextInt(freeCells.size()));
        return pnt2;
    }
     
    
          private Point hamle(Board board,String strateji)
   {
       if(strateji=="atak"){cell=Cell.CIRCLE; rakip=cell.CROSS; }
       else{cell=Cell.CROSS; rakip=Cell.CIRCLE;    }
       
   for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                 
                if(c==cell){
                    //********
                   
                    
                    
                   //*****
                if(checkCell(i, j+1,board)==1){
                if(checkCell(i, j+2,board)==0){
                
                    
                  return new Point(i,j+2);
                }}
               if(checkCell(i, j-1,board)==1){
                    if(checkCell(i, j-2,board)==0){
                
                    
                  return new Point(i,j-2);
                }}
                 
                if(checkCell(i+1, j, board)==1){
                    if(checkCell(i+2, j, board)==0){
                
                  return new Point(i+2,j);
                }}
                 if(checkCell(i-1, j, board)==1){
                         if(checkCell(i-2, j, board)==0){
               
                  return new Point(i-2,j);
                }}
                
                if(checkCell(i+1, j+1, board)==1){
                    if(checkCell(i+2, j+2, board)==0){
              
                  return new Point(i+2,j+2);
                }}
                if(checkCell(i-1, j-1, board)==1){
                    if(checkCell(i-2, j-2, board)==0){
                
                  return new Point(i-2,j-2);
                }}
                 
                if(checkCell(i-1, j+1,board)==1){
                    if(checkCell(i-2, j+2, board)==0){
                
                  return new Point(i-2,j+2);
                }}
                 if(checkCell(i+1, j-1,board)==1){
                     if(checkCell(i+2, j-2, board)==0){
                
                  return new Point(i+2,j-2);
                }}
               
            } 
           }
            }
       
 return null;
   }
          public Point atakDefans(Board board,String strateji )
          {
          if(strateji=="atak"){cell=Cell.CIRCLE; rakip=cell.CROSS; }
       else{cell=Cell.CROSS; rakip=Cell.CIRCLE;    }
       
   for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                 
                if(c==cell){
                    //********
                      int l=0; Point p=null;//////soldan saga 3tane varmı
                    for(int k=1;k<4;k++){
                     if(checkCell(i, j+k,board)==0){l++; p=new Point(i,j+k);}
                     if(checkCell(i, j,board)==1){
                        
                    }}    if(l==1){return p;}
                }}}
                    
                      for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                 
                if(c==cell){
                    
                   int l=0; Point p=null;/////////////sagdan sola 3 tane var mı
                       for(int k=1;k<4;k++){
                     if(checkCell(i, j-k,board)==0){l++; p=new Point(i,j-k);}
                     if(checkCell(i, j,board)==1){
                        
                    }}
                     if(l==1){return p;} }}}
                     
                       for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                 
                if(c==cell){
                     
                     
                   int  l=0; Point p=null;///////////////yukardan asagı 3 tane var mı
                       for(int k=1;k<4;k++){
                     if(checkCell(i+k, j,board)==0){l++; p=new Point(i+k,j);}
                     if(checkCell(i, j,board)==1){
                        
                    }}
                     if(l==1){return p;} }}}
                      for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                 
                if(c==cell){
                     
                    int  l=0; Point p=null;//////////////asagıdan yukarı 3 tane var mı
                       for(int k=1;k<4;k++){
                     if(checkCell(i-k, j,board)==0){l++; p=new Point(i-k,j);}
                     if(checkCell(i, j,board)==1){
                        
                    }}
                     if(l==1){return p;} }}}
                      for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                 
                if(c==cell){
                     
                    int  l=0; Point p=null;///////////////sol yukardan sag asagıya capraz 3tane var mı 
                       for(int k=1;k<4;k++){
                     if(checkCell(i+k, j+k,board)==0){l++; p=new Point(i+k,j+k);}
                     if(checkCell(i, j,board)==1){
                       // i++; j++;
                    }}
                     if(l==1){return p;}  }}}
                     
                       for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                 
                if(c==cell){
                     int l=0; Point p=null;///////////////sag asagıdan sol yukarı capraza 3tane var mı 
                       for(int k=1;k<4;k++){
                     if(checkCell(i-k, j-k,board)==0){l++; p=new Point(i-k,j-k);}
                     if(checkCell(i, j,board)==1){
                       // i++; j++;
                    }}
                     if(l==1){return p;} }}}
                     
                      for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                 
                if(c==cell){
                     
                     int l=0; Point p=null;/////////////sol asagıdan sag yukarıya capraz 3 tane
                       for(int k=1;k<4;k++){
                     if(checkCell(i-k, j+k,board)==0){l++; p=new Point(i-k,j+k);}
                     if(checkCell(i, j,board)==1){
                      //  i--; j++;
                    }}
                     if(l==1){return p;} }}}
                       for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                 
                if(c==cell){
                    
                     int l=0; Point p=null;/////////////sag yukarıdan sol asagıya capraz 3 tane
                       for(int k=1;k<4;k++){
                     if(checkCell(i+k, j-k,board)==0){l++; p=new Point(i+k,j-k);}
                     if(checkCell(i, j,board)==1){
                      //  i--; j++;
                    }}
                     if(l==1){return p;}
                    
                }}
          }     
   return null;
          }
}