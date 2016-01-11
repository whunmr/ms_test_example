package io.uber.api;

import io.uber.model.PriceEstimate;
import io.uber.model.Product;

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

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/estimates", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/estimates", description = "the estimates API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-01-08T12:46:14.936Z")
public class EstimatesApi {
  

  @ApiOperation(value = "Price Estimates", notes = "The Price Estimates endpoint returns an estimated price range\nfor each product offered at a given location. The price estimate is\nprovided as a formatted string with the full price range and the localized\ncurrency symbol.<br><br>The response also includes low and high estimates,\nand the [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code for\nsituations requiring currency conversion. When surge is active for a particular\nproduct, its surge_multiplier will be greater than 1, but the price estimate\nalready factors in this multiplier.", response = PriceEstimate.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "An array of price estimates by product"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "/price", 
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<List<PriceEstimate>> estimatesPriceGet(@ApiParam(value = "Latitude component of start location.", required = true) @RequestParam(value = "startLatitude", required = true) Double startLatitude


,
    @ApiParam(value = "Longitude component of start location.", required = true) @RequestParam(value = "startLongitude", required = true) Double startLongitude


,
    @ApiParam(value = "Latitude component of end location.", required = true) @RequestParam(value = "endLatitude", required = true) Double endLatitude


,
    @ApiParam(value = "Longitude component of end location.", required = true) @RequestParam(value = "endLongitude", required = true) Double endLongitude


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<PriceEstimate>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Time Estimates", notes = "The Time Estimates endpoint returns ETAs for all products offered at a given location, with the responses expressed as integers in seconds. We recommend that this endpoint be called every minute to provide the most accurate, up-to-date ETAs.", response = Product.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "An array of products"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "/time", 
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<List<Product>> estimatesTimeGet(@ApiParam(value = "Latitude component of start location.", required = true) @RequestParam(value = "startLatitude", required = true) Double startLatitude


,
    @ApiParam(value = "Longitude component of start location.", required = true) @RequestParam(value = "startLongitude", required = true) Double startLongitude


,
    @ApiParam(value = "Unique customer identifier to be used for experience customization.") @RequestParam(value = "customerUuid", required = false) String customerUuid


,
    @ApiParam(value = "Unique identifier representing a specific product for a given latitude & longitude.") @RequestParam(value = "productId", required = false) String productId


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Product>>(HttpStatus.OK);
  }

  
}
