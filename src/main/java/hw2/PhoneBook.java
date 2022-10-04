package hw2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {

        this.phonebook = new HashMap<>();
    }

    public PhoneBook() {

        this(null);
    }

    public void add(String name, String phoneNumber) {
        List<String> listOfPhoneNumbers=new ArrayList<>();
        listOfPhoneNumbers.add(phoneNumber);
        phonebook.put(name,listOfPhoneNumbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> listOfPhoneNumbers=new ArrayList<>();
        int x;
        for (String phonenumber:phoneNumbers){
            phonebook.get(name).add(phonenumber);
        }

    }

    public void remove(String name) {
        List<String>person=phonebook.get(name);
        if(person !=null){
            phonebook.remove(name);
        }
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        Boolean entry=phonebook.containsKey(name);
        return entry;
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        phonebook.entrySet();
        for(Map.Entry<String,List<String>>entry:phonebook.entrySet()){
            if(entry.getValue().contains(phoneNumber)){
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        ArrayList<String>contacts=new ArrayList<>();
        for (String contact:phonebook.keySet()){
            contacts.add(contact);
        }
        return contacts;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}