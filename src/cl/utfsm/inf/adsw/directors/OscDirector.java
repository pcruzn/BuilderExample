package cl.utfsm.inf.adsw.directors;

import cl.utfsm.inf.adsw.abstractclasses.Oscillator;
import cl.utfsm.inf.adsw.builders.OscBuilder;

// the director has a build method which is overridden by the 
// specific pwm and sin directors
// thus, the builders know the operations required to build an oscillator,
// but the directors know how and when to apply these operations
public abstract class OscDirector {
	public abstract Oscillator build(OscBuilder builder);
}
