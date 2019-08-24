package concurrentshimashima;

import org.apache.jmeter.samplers.AbstractSampler;
import org.apache.jmeter.samplers.Entry;
import org.apache.jmeter.samplers.SampleResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JmJwsSampler extends AbstractSampler {
    private static final long serialVersionUID = -9097296405116348357L;
    private static final Logger log = LoggerFactory.getLogger(JmJwsSampler.class);

    public JmJwsSampler() {
        log.info("JmJwsSampler creating");
    }

    @Override
    public SampleResult sample(Entry entry) {
        SampleResult result = new SampleResult();
        result.sampleStart();
        result.sampleEnd();

        return result;
    }
}
