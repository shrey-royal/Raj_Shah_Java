class Soup {

    //Make soup with just water
    void makeSoup(int water) {
        System.out.println("Making soup with " + water + "ml of water.");
    }

    //Make soup with water and one ingredient
    void makeSoup(int water, String ingredient) {
        System.out.println("Making soup with " + water + "ml of water and " + ingredient + ".");
    }

    //Make soup with water, a main ingredient, and seasoning
    void makeSoup(int water, String ingredient, String seasoning) {
        System.out.println("Making soup with " + water + "ml of water and " + ingredient + ", and " + seasoning + ".");
    }

    //Make soup with water, multiple ingredient, and seasoning
    void makeSoup(int water, String[] ingredients, String seasoning) {
        System.out.print("Making soup with " + water + "ml of water, ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println("\b\b and " + seasoning + ".");
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Soup mySoup = new Soup();

        // Different ways of making soup (polymorphism through overloading)
        mySoup.makeSoup(500);
        mySoup.makeSoup(500, "Okra");
        mySoup.makeSoup(500, "Corn", "Salt");
        mySoup.makeSoup(500, new String[] {"Tomato", "Cabbage", "Peas"}, "Pepper");
    }
}

/*
Method overloading is a feature in Java that allows multiple methods in the same class to have the same name but with different parameters (different number, type, or order of parameters). This is a type of compile-time polymorphism because the method to be executed is determined at compile time based on the method signature.
*/