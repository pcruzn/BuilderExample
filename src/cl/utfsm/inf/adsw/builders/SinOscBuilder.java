package cl.utfsm.inf.adsw.builders;

import cl.utfsm.inf.adsw.synthelements.SinOsc;

public class SinOscBuilder extends OscBuilder {
	private SinOsc oscillatorInProgress;
	
	public SinOscBuilder(SinOsc oscillator) {
		this.oscillatorInProgress = oscillator;
	}
	
	@Override
	public void setFrequency(int freq) {
		oscillatorInProgress.setFrequency(freq);		
	}

	@Override
	public void setAmplitude(int amp) {
		oscillatorInProgress.setAmplitude(amp);
	}

	@Override
	public void setPhase(int phase) {
		oscillatorInProgress.setPhase(phase);
	}

	@Override
	public void setWidth(int ratio) {
		// Not used here
	}

	@Override
	public SinOsc getOscillator() {
		return oscillatorInProgress;
	}

}
