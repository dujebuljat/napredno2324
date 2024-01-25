package aux_pckg;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class CLSFieldNames {

    private Class<?> cls;

    public CLSFieldNames(Class<?> cls) {
        this.cls = cls;
    }

    public String[] getFieldNames() {
        Field[] fields = cls.getDeclaredFields();
        ArrayList<String> nonStaticNames = new ArrayList<>();

        for(Field field : fields) {
            if(!Modifier.isStatic(field.getModifiers())) {
                nonStaticNames.add(field.getName());
            }
        }

        return nonStaticNames.toArray(new String[0]);
    }
}
