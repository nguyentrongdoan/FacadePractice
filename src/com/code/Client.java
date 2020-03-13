package com.code;

import com.code.gym.Facebook;
import com.code.gym.LinkedIn;
import com.code.gym.Twitter;

public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }
}
