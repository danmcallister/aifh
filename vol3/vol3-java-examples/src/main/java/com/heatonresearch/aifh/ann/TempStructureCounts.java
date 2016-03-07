/*
 * Artificial Intelligence for Humans
 * Volume 3: Deep Learning and Neural Networks
 * Java Version
 * http://www.aifh.org
 * http://www.jeffheaton.com
 *
 * Code repository:
 * https://github.com/jeffheaton/aifh
 *
 * Copyright 2014-2015 by Jeff Heaton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For more information on Heaton Research copyrights, licenses
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package com.heatonresearch.aifh.ann;

/**
 * Simple holder class that keeps the count of the neurons and weights as a neural network is built.  This class is
 * temporary and is only used briefly while the neural network structure is finalized.
 */
public class TempStructureCounts {
    /**
     * The count of neurons.
     */
    int neuronCount;

    /**
     * The count of weights.
     */
    int weightCount;

    /**
     * @return The neuron count.
     */
    public int getNeuronCount() {
        return this.neuronCount;
    }

    /**
     * @return The weight count.
     */
    public int getWeightCount() {
        return this.weightCount;
    }

    /**
     * Add to the neuron count.
     * @param i The value to add to the neuron count.
     */
    public void addNeuronCount(int i) {
        this.neuronCount+=i;
    }

    /**
     * Add to the weight count.
     * @param i The value to add to the weight count.
     */
    public void addWeightCount(int i) {
        this.weightCount+=i;
    }
}
