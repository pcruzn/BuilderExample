package cl.utfsm.inf.adsw.builders;

import cl.utfsm.inf.adsw.synthelements.PWMOsc;

public class PWMOscBuilder extends OscBuilder {
	private PWMOsc oscillatorInProgress;
	
	public PWMOscBuilder(PWMOsc oscillator) {
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
		oscillatorInProgress.setWidth(ratio);		
	}

	@Override
	public PWMOsc getOscillator() {
		return oscillatorInProgress;
	}

}
