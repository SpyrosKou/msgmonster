/*
 * Copyright 2021 msgmonster project
 * 
 * Website: https://github.com/pinorobotics/msgmonster
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
 */
package pinorobotics.msgmonster.generator;

import java.util.ArrayList;
import java.util.List;
import pinorobotics.msgmonster.ros.RosVersion;

/**
 * @author aeon_flux aeon_flux@eclipso.ch
 */
public class IntConstantDefinition {

    private List<Field> fields = new ArrayList<>();
    private RosVersion rosVersion;

    public IntConstantDefinition(
            RosVersion rosVersion, String type, String name, int id, String comment) {
        this.rosVersion = rosVersion;
    }

    public void addField(String type, String name, String value, String comment) {
        fields.add(new Field(rosVersion, name, type, value, comment));
    }

    @Override
    public String toString() {
        var buf = new StringBuilder();
        for (int i = 0; i < fields.size(); i++) {
            buf.append(fields.get(i));
        }
        return buf.toString();
    }

    public List<Field> getFields() {
        return fields;
    }
}
