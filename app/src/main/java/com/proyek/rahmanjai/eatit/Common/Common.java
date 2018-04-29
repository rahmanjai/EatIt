package com.proyek.rahmanjai.eatit.Common;

import com.proyek.rahmanjai.eatit.Model.User;

/**
 * Created by rahmanjai on 31/03/2018.
 */

public class Common {
    public static User currentUser;

    public static String convertCodeToStatus(String status) {
        if (status.equals("0"))
            return "Placed";
        else if(status.equals("1"))
            return "On My Way";
        else return "Shipped";
    }
}
