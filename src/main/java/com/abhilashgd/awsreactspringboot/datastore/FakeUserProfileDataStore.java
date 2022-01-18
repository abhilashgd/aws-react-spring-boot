package com.abhilashgd.awsreactspringboot.datastore;

import com.abhilashgd.awsreactspringboot.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/18/22
 */
@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static{
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "abhilashgd", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "testUser1", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "testUser2", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
