class MinStack {
public:
    MinStack() {
    }
    
    void push(int val) {
        stack.push_back(val);
    }
    
    void pop() {
        stack.pop_back();
    }
    
    int top() {
        size_t size{ stack.size() };
        return stack.at(size - 1);
    }
    
    int getMin() {
        int min{ INT_MAX };
        for (int i{ 0 }; i < stack.size(); i++) {
            if (stack[i] < min) {
                min = stack[i];
            }
        }
        return min;
    }

private:
    vector<int> stack;
};
