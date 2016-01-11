package io.uber.api;

import io.uber.model.Profile;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/me", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/me", description = "the me API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-01-08T12:46:14.936Z")
public class MeApi {
  

  @ApiOperation(value = "User Profile", notes = "The User Profile endpoint returns information about the Uber user that has authorized with the application.", response = Profile.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Profile information for a user"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    method = RequestMethod.GET)

  public ResponseEntity<Profile> meGet()
      throws NotFoundException {
      // do some magic!
      Profile profile = new Profile();
      profile.setEmail("whunmr@gmail.com");
      return new ResponseEntity<Profile>(profile, HttpStatus.OK);
  }
}
