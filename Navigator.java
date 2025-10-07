import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Navigator {

    public List<String> traceBack(List<String> forwardJourney) {
        Stack<String> pathStack = new Stack<>();
        for (String step : forwardJourney) {
            pathStack.push(step);
        }

        List<String> returnJourney = new ArrayList<>();
        while (!pathStack.isEmpty()) {
            String currentStep = pathStack.pop();
            String oppositeStep = getOppositeStep(currentStep);
            returnJourney.add(oppositeStep);
        }
        return returnJourney;
    }

    private String getOppositeStep(String step) {
        // Check for "LEFT", "RIGHT", and strings that start with "TAKE EXIT".
        if(step.equalsIgnoreCase("LEFT" )){return "RIGHT" ;}
        if(step.equalsIgnoreCase("RIGHT")){return "LEFT";}
        else if (step.startsWith("TAKE EXIT")) {
            String exitNumber = step.split(" ")[2];
            return "ENTER ROUND ABOUT AT EXIT " + exitNumber;

        }
else if (step.startsWith("ENTER ROUND")) {
    String exitRound =step.split(" ")[5];
            return "TAKE EXIT " + exitRound + " ON ROUND ABOUT";


        }
        return step;
    }

    }
