import axios from "axios";


class AuthService {

    // getAdminBoard() {
    //     // alert("Header is " +authHeader())
    //     return axios.get("https://localhost:1155/admin/adminProfile", { headers: authHeader() });
    // }
    
    async login(username, password) {
        const response = await axios.post(
            "http://localhost:1155/auth/generateToken",
            { username, password }
        );
    
        const token = response.data;  
    
        alert(token);
    
        if (token) {
            localStorage.setItem('token', token);
        }
    
        return token;
    }

    register(name,email,password,roles) {
        return axios.post("http://localhost:1155/auth/addNewUser" , {
            name,
            email,
            password,
            roles
          });
    }
}
export default new AuthService();