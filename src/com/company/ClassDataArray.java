package com.company;

public class ClassDataArray {
    private Person[] a;
    private int nElements;

    public ClassDataArray(int max){
        a = new Person[max];
        nElements = 0;
    }

    public Person find(String searchName){
        int j;
        for (j=0; j<nElements; j++)
            if(a[j].getlast().equals(searchName))
                break;
        if(j==nElements)
            return null;
        else
            return a[j];
    }
    public void insert(String lastName,String firstName, int age ){
        a[nElements] = new Person(lastName,firstName,age);
        nElements++;
    }

    public boolean delete(String searchName){
        int j;
        for(j=0; j<nElements; j++)
            if(a[j].getlast().equals(searchName))
                break;
        if(j == nElements)
            return false;
        else {
            for(int k=j; k<nElements; k++)
                a[k] = a[k+1];
            nElements--;
            return true;
        }
    }

    public void displayA(){
        for(int j=0; j< nElements; j++)
           a[j].displayPerson();
    }
}
