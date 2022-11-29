package com.client.clientServiceImpl;

import com.client.service.ClientService;
import com.client.utility.ClientCongiguration;
import com.client.utility.ClientRouting;
import com.client.utility.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl  implements ClientService {
    @Autowired
    private ClientCongiguration clientCongiguration;
    @Override
    public List<User> getAllUsers() {
        List<User> userlist=null;
        try {
            userlist=clientCongiguration.getRestTemplate().getForObject(ClientRouting.GET_ClIENT_DATA, List.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userlist;
    }
}
