package tryObserver;

public class CustomerTest {

        public static void main(String[] args) {

                //Create 2 stores
                Store store1=new Store("Tim Horton's", 15);
                Store store2=new Store("Starbucks", 15);
                //Create 4 customers
                Observer cust1=new Customer("Jesse L", store1);
                Observer cust2=new Customer("Daniel GK", store1);
                Observer cust3=new Customer("Abida C", store2);
                Observer cust4=new Customer("Adris A", store2);
                //Register customer 1 to store 1
                store1.register(cust1);
                //set store 1 discount
                store1.setDiscount("Christmas", 20);
                //Register customer 2 to store 2
                store2.register(cust3);
                //set store 1 discount
                store2.setDiscount("New year", 25);
                //unregister customer 1 from store 1
                store1.unregister(cust1);
                

                
        }

}