
package com.peerislands.www.employee.details.domain.dao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="designation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="qualification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;sequence>
 *                     &lt;any maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employee"
})
@XmlRootElement(name = "employees")
public class Employees {

    protected List<Employees.Employee> employee;

    /**
     * Gets the value of the employee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employees.Employee }
     * 
     * 
     */
    public List<Employees.Employee> getEmployee() {
        if (employee == null) {
            employee = new ArrayList<Employees.Employee>();
        }
        return this.employee;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="designation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="qualification" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;sequence>
     *           &lt;any maxOccurs="unbounded"/>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employeeId",
        "name",
        "age",
        "designation",
        "qualification",
        "any"
    })
    public static class Employee {

        protected long employeeId;
        @XmlElement(required = true)
        protected String name;
        protected int age;
        @XmlElement(required = true)
        protected String designation;
        @XmlElement(required = true)
        protected String qualification;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the employeeId property.
         * 
         */
        public long getEmployeeId() {
            return employeeId;
        }

        /**
         * Sets the value of the employeeId property.
         * 
         */
        public void setEmployeeId(long value) {
            this.employeeId = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the age property.
         * 
         */
        public int getAge() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         */
        public void setAge(int value) {
            this.age = value;
        }

        /**
         * Gets the value of the designation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesignation() {
            return designation;
        }

        /**
         * Sets the value of the designation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesignation(String value) {
            this.designation = value;
        }

        /**
         * Gets the value of the qualification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualification() {
            return qualification;
        }

        /**
         * Sets the value of the qualification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualification(String value) {
            this.qualification = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
