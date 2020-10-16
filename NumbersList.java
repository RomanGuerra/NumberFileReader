// Implementing a linked list.

public class NumbersList{

    private class Number{
    
        //Data Inside Node
        public int data;
        public Number next;
        
        // Constructors
        Number(int data){   
            this.data = data;
        }
    
        public void display(){
            System.out.print(data + " ");
        }
    }

    public Number head;
    public int min;
    public int max;
    public int sum = 0;
    public int product = 1;

    // When List is created first is set to null.
    NumbersList(){
        head = null;
    }

    // This method returns true if list is empty
    public boolean isEmpty(){
        return (head == null);
    }

    // This Method Process the Data.
    public void process(){
        Number current = head;
        
        //Holding Values for Min & Max
        max = current.data;
        min = current.data;
        // Process Sum & Product
        while(current != null){
            sum += current.data;
            product *= current.data;

            // Find Min & Max
            if(current.data > max){
                max = current.data;
            }
            if(current.data < min){
                min = current.data;
            }
            current = current.next;
        }
    }

    // This method adds to the list.
    public void appendList(int a){
        Number newLink = new Number(a);
        newLink.next = head;
        head =  newLink;
    }

    // This method traverses the list and displays it.
    public void display(){

        Number current = head;

        while(current != null){
            current.display();
            current = current.next;
        }
        System.out.println(); 
    }

    // Displays Min & Max
    public void displayOutput(){
        System.out.println("\nMin Value: " + min);
        System.out.println("Max Value: " + max);
        System.out.println("Sum of Values: " + sum);
        System.out.println("Product of Values: " + product + "\n");
    }

    // This method sorts the list of numbers
    public void sort(){
        Number a1 = head;
        Number a2 = null;
        int temp;

        if(head == null){
            return;
        }
        else{
            while(a1 != null){
                a2 = a1.next;

                while(a2 != null){
                    if(a1.data > a2.data){
                        temp = a1.data;
                        a1.data = a2.data;
                        a2.data = temp;
                    }
                    a2 = a2.next;
                }
                a1 = a1.next;
            }
        }
        process();
    }
}
