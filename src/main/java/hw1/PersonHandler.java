package hw1;

public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        // create a `counter
        int x=0;
        String result = "";
        // while `counter` is less than length of array
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        while(x<personArray.length){
            Person thePerson=personArray[x];
            result+= thePerson.toString();
            x++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        for(int x=0;x< personArray.length;x++){
            result+=personArray[x].toString();
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        for(Person thePerson: personArray){
            result+= thePerson.toString();
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
