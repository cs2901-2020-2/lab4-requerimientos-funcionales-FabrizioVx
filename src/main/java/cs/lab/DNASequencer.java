package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class  DNASequencer {
    static final Integer FIRST_SEQUENCE = 0;
    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part){
        String firstSubSequence = part.get(FIRST_SEQUENCE);
        String SequenceConcat = "" ;
        for(int iteratorOfSequence = 1; iteratorOfSequence < part.size();++iteratorOfSequence){
            String subSequenceActive;
            subSequenceActive = part.get(iteratorOfSequence);
            for(int iteratorOfSubSequence = 0 ;iteratorOfSubSequence < subSequenceActive.length();++iteratorOfSubSequence){
                if(!firstSubSequence.contains(subSequenceActive.substring(iteratorOfSubSequence))){
                    SequenceConcat = firstSubSequence.concat(subSequenceActive.substring(iteratorOfSubSequence));
                }
            }
        }
        return SequenceConcat;
    }
}
