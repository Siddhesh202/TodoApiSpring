package com.example.todoapispring;

import org.springframework.stereotype.Service;

@Service("fakeTodoService")
public class FakeTodoService implements TodoService{

    @TimeMonitor
    @Override
    public String doSomething() {
        for(int i = 0; i < 1000000000; i++){

        }
        return "Something from fake todo service";
    } // Join Point
}
