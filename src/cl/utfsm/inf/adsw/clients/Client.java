/**
 * author: Pablo Cruz Navea
 */
package cl.utfsm.inf.adsw.clients;

import cl.utfsm.inf.adsw.abstractclasses.Oscillator;
import cl.utfsm.inf.adsw.builders.PWMOscBuilder;
import cl.utfsm.inf.adsw.builders.SinOscBuilder;
import cl.utfsm.inf.adsw.directors.PWMOscDirector;
import cl.utfsm.inf.adsw.directors.SinOscDirector;
import cl.utfsm.inf.adsw.synthelements.PWMOsc;
import cl.utfsm.inf.adsw.synthelements.SinOsc;

public class Client {
	public static void main (String args[]) {
		// using the pattern can go in this way
		// first, create a director, then put a builder to the director
		// the builder receives the object to be constructed
		SinOscDirector theSinOscDirector = new SinOscDirector();
		Oscillator firstSinOscillator = theSinOscDirector.build(new SinOscBuilder(new SinOsc()));
		
		// let's play the first sin oscillator for 5000 [ms]
		firstSinOscillator.play();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		firstSinOscillator.stop();
		
		// building another sin oscillator is straightforward...
		Oscillator secondSinOscillator = theSinOscDirector.build(new SinOscBuilder(new SinOsc()));
		// ... and play it for 1000 [ms]
		secondSinOscillator.play();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		secondSinOscillator.stop();
		
		// what about building a pulse-width-modulation oscillator?
		PWMOscDirector thePWMOscDirector = new PWMOscDirector();
		Oscillator firstPWMOscillator = thePWMOscDirector.build(new PWMOscBuilder(new PWMOsc()));
		
		// let's play the pwm oscillator
		firstPWMOscillator.play();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		firstPWMOscillator.stop();
		
		// end note:
		// this example is for educational purposes only
		// in real life, you rarely would intend to create simple oscillators
		// but let's imagine building instruments instead
		// for instance, you can have a set of string-related instruments for which
		// the construction process is observed by specific directors, and each string instrument
		// is built according to a predefined set of operations (methods)
		// in this case, the ordering (dictated by the director) is also important as, for instance,
		// placing a filter (a filter method) before or after some sound source will 
		// noticeably impact the final sound
	}
}