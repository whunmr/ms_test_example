package io.uber.api;

import io.uber.model.Activities;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/history", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/history", description = "the history API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-01-08T12:46:14.936Z")
public class HistoryApi {
  

  @ApiOperation(value = "User Activity", notes = "The User Activity endpoint returns data about a user's lifetime activity with Uber. The response will include pickup locations and times, dropoff locations and times, the distance of past requests, and information about which products were requested.<br><br>The history array in the response will have a maximum length based on the limit parameter. The response value count may exceed limit, therefore subsequent API requests may be necessary.", response = Activities.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "History information for the given user"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<Activities> historyGet(@ApiParam(value = "Offset the list of returned results by this amount. Default is zero.") @RequestParam(value = "offset", required = false) Integer offset


,
    @ApiParam(value = "Number of items to retrieve. Default is 5, maximum is 100.") @RequestParam(value = "limit", required = false) Integer limit


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Activities>(HttpStatus.OK);
  }

  
}
