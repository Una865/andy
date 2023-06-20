package nl.tudelft.cse1110.andy.config;

import nl.tudelft.cse1110.andy.execution.mode.Mode;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultExamRunConfiguration extends RunConfiguration {

    private final List<String> classesUnderTest;

    public Mode mode() {
        return Mode.EXAM;
    }

    public DefaultExamRunConfiguration(List<String> classesUnderTest) {
        this.classesUnderTest = classesUnderTest;
    }

    @Override
    public Map<String, Float> weights() {
        return new HashMap<>() {{
            put("coverage", 0.25f);
            put("mutation", 0.25f);
            put("meta", 0.25f);
            put("codechecks", 0.25f);
        }};
    }

    @Override
    public List<String> classesUnderTest() {
        return Collections.unmodifiableList(classesUnderTest);
    }

}
