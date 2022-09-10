
public class CondicionesYCiclos {

    public static void main(String[] args)
    {
        int index = 0;
        do{
            String operation = args[index++];
            int operandLeft = Integer.parseInt(args[index++]);
            int operandRight = Integer.parseInt(args[index++]);

            switch (operation) {
                case "SUMA" ->
                        System.out.println(operandLeft + " + " + operandRight + " = " + (operandLeft + operandRight));
                case "MULTIPLICACION" ->
                        System.out.println(operandLeft + " * " + operandRight + " = " + (operandLeft * operandRight));
                case "RESTA" ->
                        System.out.println(operandLeft + " - " + operandRight + " = " + (operandLeft - operandRight));
                case "DIVISION" ->
                        System.out.println(operandLeft + " / " + operandRight + " = " + (operandLeft / operandRight));
            }
        }while(index < args.length);
    }
}

