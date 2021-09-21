package tryObserver;

public class Customer extends Observer{

    String name;
    Store favStore;
    
    /**
     * @param name
     * @param favStore
     */
    //holds customer's name and store
    public Customer(String name, Store favStore) {
            super();
            this.name = name;
            this.favStore = favStore;
    }
    //changes customer's discount value and prints it 
    @Override
    public void update(float discount) {
            favStore.discount=discount;
            System.out.println("Customer Name: "+name);
            System.out.println("Discount: "+discount);

    }
    //adds customer to database
    void register(Store store) {
            // TODO Auto-generated method stub
            store.register(this);
    }
    //removes customer from database
    void unregister(Store store) {
            // TODO Auto-generated method stub
            try {
                    store.unregister(this);
                    System.out.println("Removed Customer "+this+" from store "+store.name);
            }
            catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("No such Customer called "+this+" in store "+store.name);
            }

    }

    @Override
    public String toString() {
            return  name ;
    }
    
    

}