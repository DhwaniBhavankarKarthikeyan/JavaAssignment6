**Part 1a: Fixed Stack Implementation**
This set of Java code implements a fixed-size stack using the Interface_STK interface and the Fixed_stk class. 
The stack is designed with basic push, pop, display, overflow, and underflow operations. 
The Fixed_stk_Demo class demonstrates the usage of the fixed stack by pushing and popping elements, showcasing its fundamental functionality.

Functions in each class and their purpose : 
i) Interface_STK:
    push(int element): Adds an element to the stack.
    pop(): Removes and returns the top element from the stack.
    displayStack(): Displays the elements of the stack.
    isOverflow(): Checks if the stack is full.
    isUnderflow(): Checks if the stack is empty.
    
ii) Fixed_stk:
    push(int element): Adds an element to the stack if there is space.
    pop(): Removes and returns the top element if the stack is not empty.
    displayStack(): Displays the elements of the stack.
    isOverflow(): Checks if the stack is full.
    isUnderflow(): Checks if the stack is empty.
    
iii) Fixed_stk_Demo:
    main(String[] args): Demonstrates the usage of the fixed stack by pushing and popping elements, showcasing its basic functionality.



**Part 1b: Growable Stack Implementation**
The second set of code presents a growable stack using the Interface_GSTK interface and the Growable_stk class. 
Utilizing an ArrayList, this implementation allows the stack to dynamically resize as needed. 
The GStackDemo class demonstrates the growable stack by pushing elements onto the stack and popping them off, illustrating its flexibility.

Functions in each class and their purpose : 
i) Interface_GSTK:
    push(int element): Adds an element to the stack.
    pop(): Removes and returns the top element from the stack.
    displayStack(): Displays the elements of the stack.
    isOverflow(): Checks if the stack is full.
    isUnderflow(): Checks if the stack is empty.
    
ii) Growable_stk:
    push(int element): Adds an element to the stack, dynamically resizing if needed.
    pop(): Removes and returns the top element if the stack is not empty.
    displayStack(): Displays the elements of the stack.
    isOverflow(): Always returns false as the stack can dynamically resize.
    isUnderflow(): Checks if the stack is empty.
    
iii) GStackDemo:
    main(String[] args): Demonstrates the usage of the growable stack by pushing and popping elements, showcasing its flexibility.



**Part 2: Student and Result Classes**
The third set of Java code introduces a class hierarchy consisting of the Student, Exam, and Result classes. 
The Student class encapsulates student details, and the Exam interface defines a method for calculating percentages. 
The Result class, extending Student and implementing Exam, calculates and displays a student's percentage based on five subject marks. 
The Result class also includes a main method for demonstrating its functionality.

Functions in each class and their purpose : 
i) Student:
    getName(): Returns the student's name.
    setName(String name): Sets the student's name.
    getRoll_no(): Returns the student's roll number.
    setRoll_no(int roll_no): Sets the student's roll number.
    getMark1(), getMark2(), ..., getMark5(): Returns the marks for each subject.
    setMark1(int mark1), setMark2(int mark2), ..., setMark5(int mark5): Sets the marks for each subject.

ii) Exam:
    percent_cal(): Calculates and returns the percentage based on marks.

iii) Result (extends Student, implements Exam):
    percent_cal(): Overrides the method to calculate the percentage based on five subject marks.
    main(String[] args): Demonstrates the usage of the Result class by creating an instance and displaying student information along with calculated percentage.
    
