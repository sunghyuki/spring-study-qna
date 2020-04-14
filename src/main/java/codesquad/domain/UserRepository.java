package codesquad.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public List<User> selectAll() {
        return users;
    }

    public void insert(User user) {
        users.add(user);
    }

    public User select(String userId) {
        for (User user : users) {
            if (user.isSameId(userId)) {
                return user;
            }
        }
        return null;
    }
}
