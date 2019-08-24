package concurrentshimashima;

import org.apache.jmeter.gui.util.VerticalPanel;
import org.apache.jmeter.samplers.gui.AbstractSamplerGui;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jorphan.gui.JLabeledTextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;

public class JmJwsSamplerGui extends AbstractSamplerGui {
    private static final long serialVersionUID = 1636183518392813097L;
    private static final Logger log = LoggerFactory.getLogger(JmJwsSamplerGui.class);

    public JmJwsSamplerGui() {
        log.info("Gui creating");
        init();
    }

    private void init() {
        setLayout(new BorderLayout());
        setBorder(makeBorder());
        Box box = Box.createVerticalBox();
        box.add(makeTitlePanel());
        add(box,BorderLayout.NORTH);
        add(makeMainPanelContents(),BorderLayout.CENTER);
    }

    private JPanel makeMainPanelContents() {
        JPanel panel = new VerticalPanel();
        panel.add(new JLabeledTextField("label name"));

        return panel;
    }

    @Override
    public void configure(TestElement element) {
        log.info("configure called");
        super.configure(element);
    }

    /**
     * JMeterのSampler一覧などに表示される時の名前
     * @return
     */
    @Override
    public String getStaticLabel() {
        log.info("getStaticLabel called");
        return "JmJwsSampler";
    }

    /**
     * このGuiクラスが使用するSamplerの名前。
     * どうやらリフレクションを使っているらしく、ちゃんとした値を返さないとJMeter起動時に謎のNullPoで起動エラーになる
     */
    @Override
    public String getLabelResource() {
        log.info("getLabelResource called");
        return "JmJwsSampler";
    }

    @Override
    public TestElement createTestElement() {
        log.info("createTestElement called");
        JmJwsSampler sampler = new JmJwsSampler();
        modifyTestElement(sampler);
        return sampler;
    }

    // called when GUI input modified
    @Override
    public void modifyTestElement(TestElement testElement) {
        log.info("modifyTestElement");
        super.configureTestElement(testElement);
    }
    @Override
    public JPopupMenu createPopupMenu() {
        log.info("createPopupMenu called");
        return super.createPopupMenu();
    }
}
