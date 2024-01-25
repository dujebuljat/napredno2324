package pckg_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLowerBound {

    public static void main(String[] args) {

        User user = new User("Zorana");
        BestUser bestUser = new BestUser("Filip");
        AdvancedUser advancedUser = new AdvancedUser("Robi");
        SuperUser superUser = new SuperUser("Emily");
        User[] users = {user, bestUser, advancedUser, superUser};
        List<User> userList = new ArrayList<>(Arrays.asList(users));
        ListOperator.listElements(userList);
        SuperUser[] superUsers = {new SuperUser("Valentino"), new SuperUser("Eva")};
        List<SuperUser> superUserList = new ArrayList<>(Arrays.asList(superUsers));
//        ListOperator.listElements(superUserList);
    }
}
