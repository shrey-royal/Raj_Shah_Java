class Chef {
    public void prepareDish() {
        System.out.println("The chef prepares a generic dish.");
    }
}

class ItalianChef extends Chef {
    @Override   //Annotation - it confirms that the method is being overridden.
    public void prepareDish() {
        System.out.println("The Italian chef prepares Pasta with Marinara Sauce.");
    }
}

class ChineseChef extends Chef {
    @Override
    public void prepareDish() {
        System.out.println("The Chinese chef prepares Hakka Noodles.");
    }
}

class IndianChef extends Chef {
    @Override
    public void prepareDish() {
        System.out.println("The Indian chef prepares Khichdi.");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Chef myChef = new Chef();
        Chef italian = new ChineseChef();
        Chef chinese = new ChineseChef();
        Chef indian = new IndianChef();
    
        myChef.prepareDish();
        italian.prepareDish();
        chinese.prepareDish();
        indian.prepareDish();
    }
}

/*
Method overriding in Java is when a subclass provides a specific implementation of a method that is already defined in its parent class. The overridden method in the subclass must have the same name, return type, and parameters as the method in the parent class. It allows runtime polymorphism, meaning the method that gets called is determined by the actual object type, not the reference type.
*/