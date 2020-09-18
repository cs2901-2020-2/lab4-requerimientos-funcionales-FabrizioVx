package cs.lab;
import java.util.List;
import java.util.logging.Logger;
public class  DNASequencer {
    static final Integer FIRST_SEQUENCE = 0;
    static final Integer MAXIMUM_LENGTH_OF_SEQUENCE = 160000;
    static final Integer MAXIMUM_LENGTH_OF_SUBSEQUENCE = 200;
    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public static String concatSubSequences(List<String> sequence) throws TooManyException {
        String pending = "";
        String firstSubSequence = sequence.get(FIRST_SEQUENCE);
        for (int iteratorOfSequence = 1; iteratorOfSequence < sequence.size(); ++iteratorOfSequence) {
            String subSequenceActive = sequence.get(iteratorOfSequence);
            for (int iteratorOfSubSequence = 0; iteratorOfSubSequence < subSequenceActive.length(); ++iteratorOfSubSequence) {
                if (!firstSubSequence.contains(subSequenceActive.substring(iteratorOfSubSequence))) {
                    pending = firstSubSequence.concat(subSequenceActive.substring(iteratorOfSubSequence));
                }
            }
        }
        return  pending;
    }
    public String calculate(List<String> part) throws TooManyException{
        String result;
        String firstSubSequence = part.get(FIRST_SEQUENCE);
        if (part.size() > MAXIMUM_LENGTH_OF_SEQUENCE){
            throw new TooManyException("SECUENCIA ES DEMASIADO LARGA");
        } else if (firstSubSequence.length() > MAXIMUM_LENGTH_OF_SUBSEQUENCE) {
            throw new TooManyException("LA SUBSECUENCIA ES MUY LARGA Y DE " + firstSubSequence.length() + " CARACTERES");
        } else {
            result = concatSubSequences(part);
        }
        return result;
    }
}