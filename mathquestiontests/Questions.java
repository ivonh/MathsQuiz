/*
File Name: Questions.java
Purpose: To create the math questions for the test program.
Author: Ivon Harris
Date last Worked on: 22/11/2021
Version: 1.17
Notes: Lost my entire project attempting to submit to GitHub trhough connection. 

 */
package mathquestiontests;

public class Questions implements Comparable<Questions>
{
    private int leftOperand;
    private int rightOperand;
    private String Operator;
    private int answer;
    
    //Constructor method
    public Questions (int leftOperand, int rightOperand, String Operator, int answer)
    {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.Operator = Operator;
        this.answer = answer;
        
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
    
    //get methods
    
    //set methods
    
    //compareTo() method
    public int compareTo(Questions otherQuestion)
    {
        if (this.answer == otherQuestion.answer)
        {
            return 0;
        }
        else if (this.answer < otherQuestion.answer)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
    
    @Override
    public String toString()
    {
        //3+4=7
        return leftOperand + " " + Operator + " " + rightOperand + " = " + answer;
    }
    
}
