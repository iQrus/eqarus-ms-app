package com.eqarus.app.ws.userservice;

import com.eqarus.app.ws.ui.model.request.UserRequest;
import com.eqarus.app.ws.ui.model.response.UserRest;

public interface UserService {

	UserRest createUser(UserRequest userDetails);

}
