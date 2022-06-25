package sg.iss.sa54.EugeneOng.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class FibonacciRest {
    private List<Integer> fibonacci;
    private List<Integer> sorted;

    public FibonacciRest(List<Integer> fibonacci, List<Integer> sorted) {
        this.fibonacci = fibonacci;
        this.sorted = sorted;
    }

    public List<Integer> getFibonacci() {
        return fibonacci;
    }

    public void setFibonacci(List<Integer> fibonacci) {
        this.fibonacci = fibonacci;
    }

    public List<Integer> getSorted() {
        return sorted;
    }

    public void setSorted(List<Integer> sorted) {
        this.sorted = sorted;
    }
}
