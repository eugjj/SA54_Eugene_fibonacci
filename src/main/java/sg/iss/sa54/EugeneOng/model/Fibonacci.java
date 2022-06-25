package sg.iss.sa54.EugeneOng.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Fibonacci {
    private Integer elements;
    private List<Integer> fibonacci;
    private List<Integer> sorted;

    public Integer getElements() {
        return elements;
    }

    public void setElements(Integer elements) {
        this.elements = elements;
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
