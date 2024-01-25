package pckg_diamond;

import java.util.ArrayList;

public class Package <T>{

    private ArrayList<T> packageContent;
    private Class<T> classType;

    public Package(T contentElement, Class<T> type) {
        this.packageContent = new ArrayList<>();
        this.classType = type;
        addToPackage(contentElement);

    }

    public void addToPackage(T packageElement) {
        if(packageContent.contains(packageElement)) {
            System.out.println("Element " + packageElement + " already exists in the package.");
        } else {
            packageContent.add(packageElement);
            System.out.println("Element " + packageElement + " added to the package.");
        }
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageContent=" + packageContent +
                ", classType=" + classType.getSimpleName() +
                '}';
    }
}
