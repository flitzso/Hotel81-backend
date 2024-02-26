package com.hotel81.Service;

import com.hotel81.DTO.ClientDTO;
import com.hotel81.DTO.LoginDTO;
import com.hotel81.LoginResponse.LoginMesage;

public interface ClientService {
    String addClient(ClientDTO employeeDTO);
    LoginMesage loginClient(LoginDTO loginDTO);
}