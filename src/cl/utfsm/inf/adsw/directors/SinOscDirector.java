package cl.utfsm.inf.adsw.directors;

import cl.utfsm.inf.adsw.abstractclasses.Oscillator;
import cl.utfsm.inf.adsw.builders.OscBuilder;

public class SinOscDirector extends OscDirector {

	@Override
	public Oscillator build(OscBuilder builder) {

		builder.setFrequency(440);
		builder.setAmplitude(1);
		builder.setPhase(10);
		
		return builder.getOscillator();
	}



}
