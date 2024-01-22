
package io.fabric8.kubernetes.api.model.ovn.v1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "dscp",
    "dstCIDR",
    "podSelector"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class EgressQoSRule implements Editable<EgressQoSRuleBuilder> , KubernetesResource
{

    @JsonProperty("dscp")
    private Integer dscp;
    @JsonProperty("dstCIDR")
    private String dstCIDR;
    @JsonProperty("podSelector")
    private io.fabric8.kubernetes.api.model.LabelSelector podSelector;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EgressQoSRule() {
    }

    public EgressQoSRule(Integer dscp, String dstCIDR, io.fabric8.kubernetes.api.model.LabelSelector podSelector) {
        super();
        this.dscp = dscp;
        this.dstCIDR = dstCIDR;
        this.podSelector = podSelector;
    }

    @JsonProperty("dscp")
    public Integer getDscp() {
        return dscp;
    }

    @JsonProperty("dscp")
    public void setDscp(Integer dscp) {
        this.dscp = dscp;
    }

    @JsonProperty("dstCIDR")
    public String getDstCIDR() {
        return dstCIDR;
    }

    @JsonProperty("dstCIDR")
    public void setDstCIDR(String dstCIDR) {
        this.dstCIDR = dstCIDR;
    }

    @JsonProperty("podSelector")
    public io.fabric8.kubernetes.api.model.LabelSelector getPodSelector() {
        return podSelector;
    }

    @JsonProperty("podSelector")
    public void setPodSelector(io.fabric8.kubernetes.api.model.LabelSelector podSelector) {
        this.podSelector = podSelector;
    }

    @JsonIgnore
    public EgressQoSRuleBuilder edit() {
        return new EgressQoSRuleBuilder(this);
    }

    @JsonIgnore
    public EgressQoSRuleBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
