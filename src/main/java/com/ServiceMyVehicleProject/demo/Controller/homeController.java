package com.ServiceMyVehicleProject.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ServiceMyVehicleProject.demo.Dao.CustomerRepo;
import com.ServiceMyVehicleProject.demo.Entities.Customer;
import com.ServiceMyVehicleProject.demo.dto.AuthenticationRequest;
import com.ServiceMyVehicleProject.demo.dto.AuthenticationResponse;
import com.ServiceMyVehicleProject.demo.security.JwtUtil;
import com.ServiceMyVehicleProject.demo.security.MyUserDetailsService;



@RestController
@RequestMapping("/login")
public class homeController {
	
	@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;
    
    @Autowired
    private CustomerRepo custrepo;

    @Autowired
    private JwtUtil jwtUtil;
    
    @GetMapping("/message")
    public String getMessage() {
    	return "Hello world";
    }

    @PostMapping("/user")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
        );

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        
        Customer customer = custrepo.findByCemail(authenticationRequest.getUsername());

        return ResponseEntity.ok(new AuthenticationResponse(jwt,customer));
    }
	
}
