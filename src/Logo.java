public class Logo {
    private Integer inputData;
    private StringBuilder resultFromDraw;


    public Logo(Integer n) {
        this.inputData = n;
        this.resultFromDraw = new StringBuilder();
    }

    public void draw() {
        int numberOfDashes = 0;
        int numberOfStars = inputData;

        for (int i = 0; i < (inputData + 1) / 2; i++) {
            numberOfDashes = inputData - i;

            drawUpperPart(resultFromDraw, numberOfDashes, numberOfStars, i);

            numberOfStars += 2;
            resultFromDraw.append(System.lineSeparator());

        }
        numberOfStars -= 2;
        int dashCounter = 1;

        for (int i = 0; i < (inputData + 1) / 2; i++) {
            numberOfDashes = inputData / 2 - i;

            drawBottomPart(inputData, resultFromDraw, numberOfDashes, numberOfStars, dashCounter);

            resultFromDraw.append(System.lineSeparator());
            dashCounter += 2;
            numberOfStars -= 2;


        }
    }


    private void drawUpperPart(StringBuilder resultFromDraw, int numberOfDashes, int numberOfStars, int i) {
        resultFromDraw.append("-".repeat(numberOfDashes));
        resultFromDraw.append("*".repeat(numberOfStars));
        resultFromDraw.append("-".repeat(numberOfDashes - i));
        resultFromDraw.append("*".repeat(numberOfStars));
        resultFromDraw.append("-".repeat(numberOfDashes * 2));
        resultFromDraw.append("*".repeat(numberOfStars));
        resultFromDraw.append("-".repeat(numberOfDashes - i));
        resultFromDraw.append("*".repeat(numberOfStars));
        resultFromDraw.append("-".repeat(numberOfDashes));
    }

    private void drawBottomPart(int inputData, StringBuilder resultFromDraw, int numberOfDashes, int numberOfStars, int dashCounter) {
        resultFromDraw.append("-".repeat(numberOfDashes));
        resultFromDraw.append("*".repeat(inputData));
        resultFromDraw.append("-".repeat(dashCounter));
        resultFromDraw.append("*".repeat(numberOfStars));
        resultFromDraw.append("-".repeat(dashCounter));
        resultFromDraw.append("*".repeat(inputData));
        resultFromDraw.append("-".repeat(numberOfDashes * 2));
        resultFromDraw.append("*".repeat(inputData));
        resultFromDraw.append("-".repeat(dashCounter));
        resultFromDraw.append("*".repeat(numberOfStars));
        resultFromDraw.append("-".repeat(dashCounter));
        resultFromDraw.append("*".repeat(inputData));
        resultFromDraw.append("-".repeat(numberOfDashes));
    }

    @Override
    public String toString() {
        return resultFromDraw.toString().trim();
    }
}
