package sg.iss.sa54.EugeneOng.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import sg.iss.sa54.EugeneOng.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

@RestController
public class FibonacciController {

    @GetMapping(path="/fibonacci")
    public ResponseEntity getFibonacci(@RequestBody Fibonacci fibonacci){
        List<Integer> fib = sortedFibonacci(fibonacci.getElements());
        List<Integer> rev = reverseFibonacci(fib);

        return new ResponseEntity(new FibonacciRest(fib, rev),HttpStatus.OK);
    }

    public List<Integer> sortedFibonacci(int elements){
        int firstnum = 1;
        int secondnum = 2;
        List<Integer> fibonList = new ArrayList<Integer>();

        for (int i = 2; i<= elements; ++i){
            fibonList.add(firstnum);

            // compute next number
            int nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }
        sort(fibonList);
        return fibonList;
    }


    public List<Integer> reverseFibonacci(List<Integer> list){
        Collections.reverse(list);
        return list;
    }

}
