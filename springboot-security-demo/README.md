### Steps
	
    * Get token  after authentication
    *  Pass token to access resources
## Authentication

   * use /authenticate endpoint.This endpoint is POST , as payload you need to send usernaem and password
   
   {
	"username":"**",
	"password":"**" }
   
   * Obtain Token
   
   * use token and pass 
       Authorization  Bearer {token}
       
       

#### Notes:
  	
   	* MyUserDetailsService loads user , i need to get it from DB 
  
   	* SecurityConfigurer sets /authenticate and filter for validation
  
  	* JwtRequestFilter  validate token
  
   

   
   
   
   