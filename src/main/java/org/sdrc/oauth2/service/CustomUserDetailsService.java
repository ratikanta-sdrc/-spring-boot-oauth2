package org.sdrc.oauth2.service;

import java.util.Optional;

import org.sdrc.oauth2.domain.CustomUserDetails;
import org.sdrc.oauth2.domain.User;
import org.sdrc.oauth2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		Optional<User> optionalUser = userRepository.findByUsername(username);
		
		optionalUser.orElseThrow(()-> new UsernameNotFoundException("Username not found"));
				
		return optionalUser
				.map(CustomUserDetails::new)
				.get();
	}

}
