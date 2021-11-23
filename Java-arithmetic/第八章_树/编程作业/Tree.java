package 第八章_树.编程作业;

import java.util.Stack;

/**
 * Author:  blithe.xwj
 * Date:    2021/10/20 21:47
 * Description:
 */


class Tree {
   private Node root;

   public Tree(){
      root = null;
   }
   public Tree(Node root){
      this.root = root;
   }

   public static Tree create(String words){
      Tree[] forest = new Tree[words.length()];
      Tree add = new Tree(new Node('+'));
      for(int i = 0 ; i < words.length() ; i ++){
         Tree tree = new Tree(new Node(words.charAt(i)));
         forest[i] = tree;
      }
      Node current = add.root;
      for(int i = 0 ; i < words.length() ; i ++){
         /*
         if(i <= words.length() - 3){
            current.leftChild = forest[i].root;
            current.rightChild = forest[i + 1].root;
            break;
         }
         */
         current.rightChild = forest[i].root;
         if(i == words.length() - 2){
            current.leftChild = forest[i + 1].root;
            break;
         }else {
            current.leftChild = new Node('+');
         }
         current = current.leftChild;
      }
      return add;
   }

   public void traverse(int traverseType){
      switch(traverseType){
         case 1:
            System.out.print("\nPreorder traversal: ");
            preOrder(root);
            break;
         case 2:
            System.out.print("\nInorder traversal: ");
            inOrder(root);
            break;
         case 3:
            System.out.print("\nPostorder traversal: ");
            postOrder(root);
            break;
      }
      System.out.println("");
   }

   private void preOrder(Node localRoot){
      if(localRoot != null){
         System.out.print(localRoot.cData + " ");
         preOrder(localRoot.leftChild);
         preOrder(localRoot.rightChild);
      }
   }

   private void inOrder(Node localRoot){
      if(localRoot != null){
         inOrder(localRoot.leftChild);
         System.out.print(localRoot.cData + " ");
         inOrder(localRoot.rightChild);
      }
   }

   private void postOrder(Node localRoot){
      if(localRoot != null){
         postOrder(localRoot.leftChild);
         postOrder(localRoot.rightChild);
         System.out.print(localRoot.cData + " ");
      }
   }


   public void displayTree(){
      Stack globalStack = new Stack();
      globalStack.push(root);
      int nBlanks = 64;
      boolean isRowEmpty = false;
      System.out.println(".................................................................." +
              ".............................................................................");
      while(!isRowEmpty){
         Stack localStack = new Stack();
         isRowEmpty = true;

         for(int j = 0 ; j < nBlanks ; j ++){
            System.out.print(' ');
         }

         while(!globalStack.isEmpty()){
            Node temp = (Node)globalStack.pop();
            if(temp != null){
               System.out.print(temp.cData);
               localStack.push(temp.leftChild);
               localStack.push(temp.rightChild);

               if(temp.leftChild != null || temp.rightChild != null){
                  isRowEmpty = false;
               }
            }else{
               System.out.print("--");
               localStack.push(null);
               localStack.push(null);
            }
            for(int j = 0 ; j < nBlanks * 2 - 2 ; j ++){
               System.out.print(' ');
            }
         }
         System.out.println("");
         nBlanks /= 2;
         while(!localStack.isEmpty()){
            globalStack.push(localStack.pop());
         }
         System.out.println(".................................................................." +
                 ".............................................................................");
      }
   }
}
